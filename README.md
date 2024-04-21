Requirements:

1. Java jdk 1.8 or above
2. Maven
3. Intelij
4. Google chrome with base version of 123.0.x.x
5. The chrome driver added in the project is compatible with mac-arm64. If Windows is being used then the corresponding chromedriver has to be downloaded and placed in the location of "chromedriver" in the root directory 
6. ChromeDriver for mac link:-https://storage.googleapis.com/chrome-for-testing-public/123.0.6312.122/mac-arm64/chromedriver-mac-arm64.zip
7. chromedriver for other os can be found in https://googlechromelabs.github.io/chrome-for-testing/

Steps to follow
1. Clone the project from the git repository.
2. open the folder from Intellij
3. run "mvn -U clean install -Dmaven.test.skip=true" and ensure that there are no errors.If there are some errors try to clear the .m2 folder's file which corresponds to error message

<img width="1147" alt="Screenshot 2024-04-20 at 11 22 00 PM" src="https://github.com/subramanyaganesh/FetchCodingExercise/assets/48938733/d9a19bac-2f05-4491-b8ed-51cae69d6a99">


4. Navigate to the following path::src->test->TestPlan and run the tests by clicking the green arrow button next to the classname.

<img width="248" alt="Screenshot 2024-04-20 at 10 07 36 PM" src="https://github.com/subramanyaganesh/FetchCodingExercise/assets/48938733/6807c220-11d3-44e7-95a2-bc0fc5d778f2">

   
6.  The result would look like this:

<img width="833" alt="Screenshot 2024-04-20 at 11 47 31 PM" src="https://github.com/subramanyaganesh/FetchCodingExercise/assets/48938733/790c01ae-ce8c-444e-9395-5954798ebfa3">


Algorithm Explanation
1. Group the numbers from 0 to 8 into 3 groups.
2. Iteration 1 ::: weigh group1 and group2
  a. if both are of same weight then the the defective bar is in group3
  b. else if they are unequal then the lighest group has the defective element
3. save this defective group into a temporary variable and update all the groups with the elemts of the temporary variable. Now we have 1 element in each group
4. Iteration 2 ::: weigh group1 and group2
  a. if both are of same weight then the the defective bar is in group3
  b. else if they are unequal then the lighest group is the defective element


Snippet and Screenshots of the execution 


<img width="693" alt="Screenshot 2024-04-20 at 11 39 11 PM" src="https://github.com/subramanyaganesh/FetchCodingExercise/assets/48938733/68f02842-3813-4bdb-ab92-4075ffab0b7e">

<img width="657" alt="Screenshot 2024-04-20 at 11 39 13 PM" src="https://github.com/subramanyaganesh/FetchCodingExercise/assets/48938733/d47fe162-d920-4572-94f2-38f149bc1548">

<img width="657" alt="Screenshot 2024-04-20 at 11 39 15 PM" src="https://github.com/subramanyaganesh/FetchCodingExercise/assets/48938733/6f346c24-9d2e-420c-a417-479a357b5300">






