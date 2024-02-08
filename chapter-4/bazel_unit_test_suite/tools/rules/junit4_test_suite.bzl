load("@rules_java//java:defs.bzl", "java_test")

_TEST_SUITE_TEMPLATE = """import org.junit.runners.Suite;
import org.junit.runner.RunWith;

@RunWith(Suite.class)
@Suite.SuiteClasses({%s})
public class %s {}
"""

_VALID_PACKAGE_PREFIX = ("org", "com", "edu")

def _GetIndex(l, val):
    for i, v in enumerate(l):
        if val == v:
            return i
    return -1

def _GetClassName(fname):
    fname = [x.path for x in fname.files.to_list()][0]
    toks = fname[:-5].split("/")
    findex = -1
    for s in _VALID_PACKAGE_PREFIX:
        findex = _GetIndex(toks, s)
        if findex != -1:
            break
    if findex == -1:
        fail("%s does not contain any of %s" % (fname, _VALID_PACKAGE_PREFIX))
    return ".".join(toks[findex:]) + ".class"

def _impl(ctx):
    classes = ",".join(
        [_GetClassName(x) for x in ctx.attr.srcs],
    )
    ctx.actions.write(output = ctx.outputs.out, content = _TEST_SUITE_TEMPLATE % (
        classes,
        ctx.attr.outname,
    ))

_GenSuite = rule(
    attrs = {
        "srcs": attr.label_list(allow_files = True),
        "outname": attr.string(),
    },
    outputs = {"out": "%{name}.java"},
    implementation = _impl,
)

def junit4_test_suite(name, srcs, **kwargs):
    s_name = name.replace("-", "_") + "TestSuite"
    _GenSuite(
        name = s_name,
        srcs = srcs,
        outname = s_name,
    )
    java_test(
        name = name,
        test_class = s_name,
        srcs = srcs + [":" + s_name],
        **kwargs
    )
