import {number} from '@org/common'
import * as request from 'supertest'

import app from './app'

test('should return the answer to everything', async () => {
  const res = await request(app).get('/')
  expect(res.body).toEqual({number})
})
