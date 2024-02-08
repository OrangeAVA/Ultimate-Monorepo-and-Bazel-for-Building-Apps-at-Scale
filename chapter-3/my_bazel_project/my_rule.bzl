def _my_rule_impl(ctx):
    output = ctx.outputs.output
    content = ctx.attr.content
    ctx.actions.write(output, content)

my_rule = rule(
    implementation = _my_rule_impl,
    attrs = {
        "content": attr.string(),
    },
    outputs = {
        "output": "%{name}.txt",
    },
)
