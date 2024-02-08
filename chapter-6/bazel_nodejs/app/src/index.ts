import express from 'express';
const { greeting } = require('../common/greeting');

const app = express();
const port = 3000;

app.get('/', (req, res) => {
  res.send(greeting('Hello Bazel!'));
});

app.listen(port, () => {
  console.log(`Server running on http://localhost:${port}`);
});
