Requirements:

1. ChromeDriver link:-https://storage.googleapis.com/chrome-for-testing-public/123.0.6312.122/mac-arm64/chromedriver-mac-arm64.zip
2. Intelij or Eclipse
3. Google chrome with base version of 123.0.x.x

Steps to follow
1. Clone the project from the git repository.
2. open the folder from Intellij
3. run mvn -U clean install and ensure that there are no errors.If there are some errors try to clear the .m2 folder's file which corresponds to error message
4. Navigate to the following path::src->test->TestPlan