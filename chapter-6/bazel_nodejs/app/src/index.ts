import express from 'express';
import { greeting } from '../../common/src/greeting';

const app = express();
const port = 3000;

app.get('/', (req: express.Request, res: express.Response) => {
  res.send(greeting('Hello Bazel!'));
});

app.listen(port, () => {
  console.log(`Server running on http://localhost:${port}`);
});
