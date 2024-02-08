import { defineConfig } from 'cypress';

export default defineConfig({
  fileServerFolder: '.',
  fixturesFolder: './src/fixtures',
  video: true,
  videosFolder: './cypress/videos',
  screenshotsFolder: './cypress/screenshots',
  defaultCommandTimeout: 30000,
  requestTimeout: 30000,
  responseTimeout: 30000,

  e2e: {
    baseUrl: 'https://example.cypress.io/',
    specPattern: './src/e2e/**/*.spec.ts',
    supportFile: './src/support/e2e.ts',
  },
});
