# Introduction:
This project utilizes Selenium along with ChromeDriver(webdriver) to facilitate automated testing of web applications using Java. The primary focus of this project is to device an algorithm to find the defective gold bar among 9 gold bars and also minimize the number of iterations required to find it.

# Requirements:
1. Java jdk 1.8 or above
2. Maven [installation Link](https://maven.apache.org/install.html)
3. Intelij or commandline(preferablely)
4. Google chrome with base version of 123.0.x.x
5. The chrome driver added in the project is compatible with mac-arm64. If Windows is being used then the corresponding chromedriver has to be downloaded and placed in the location of "chromedriver" in the root directory 
6. ChromeDriver for mac [ download link](https://storage.googleapis.com/chrome-for-testing-public/123.0.6312.122/mac-arm64/chromedriver-mac-arm64.zip). By default this is installed and placed in the root folder.
7. chromedriver for other OS can be found [here](https://googlechromelabs.github.io/chrome-for-testing/)


# Steps to follow
1. Clone the project from the git repository
```
git clone git@github.com:subramanyaganesh/FetchCodingExercise.git
```
2. move into the folder
```
cd FetchCodingExercise
```
3. run the command "mvn -U clean install -Dmaven.test.skip=true" and ensure that there are no errors. If there are some errors try to clear the .m2 folder's file which corresponds to error message
```
mvn -U clean install -Dmaven.test.skip=true
```

<img width="1147" alt="Screenshot 2024-04-20 at 11 22 00 PM" src="https://github.com/subramanyaganesh/FetchCodingExercise/assets/48938733/d9a19bac-2f05-4491-b8ed-51cae69d6a99">

## Run option 1
<ol type="a">
  <li>open the terminal and ensure that you are in the project directory</li>
  <li>run the following maven command</li>
</ol>

```
mvn -U clean install
```



## Run option 2
<ol type="a">
  <li>Navigate to the folder where the code is cloned and open this project in Intellij</li>
  <li>Navigate to the following path::src->test->TestPlan and run the tests by clicking the green arrow button next to the classname.</li>
</ol>

<img width="248" alt="Screenshot 2024-04-20 at 10 07 36 PM" src="https://github.com/subramanyaganesh/FetchCodingExercise/assets/48938733/6807c220-11d3-44e7-95a2-bc0fc5d778f2">

   
4. The result would look like this:

<img width="833" alt="Screenshot 2024-04-20 at 11 47 31 PM" src="https://github.com/subramanyaganesh/FetchCodingExercise/assets/48938733/790c01ae-ce8c-444e-9395-5954798ebfa3">


# Algorithm Explanation
1. Group the numbers from 0 to 8 into 3 groups.
2. Iteration 1 ::: weigh group1 and group2
   <ol type="a">
     <li>if both are of same weight then the the defective bar is in group3</li>
     <li>else if they are unequal then the lighest group has the defective element</li>
   </ol>
3. save this defective group into a temporary variable and update all the groups with the elements of the temporary variable. Now we have 1 element in each group
4. Iteration 2 ::: weigh group1 and group2
   <ol type="a">
      <li>if both are of same weight then the the defective bar is in group3</li>
      <li>else if they are unequal then the lighest group is the defective element</li>
   </ol>
 

# Screenshots of the execution 

<img width="693" alt="Screenshot 2024-04-20 at 11 39 11 PM" src="https://github.com/subramanyaganesh/FetchCodingExercise/assets/48938733/68f02842-3813-4bdb-ab92-4075ffab0b7e">

<img width="657" alt="Screenshot 2024-04-20 at 11 39 13 PM" src="https://github.com/subramanyaganesh/FetchCodingExercise/assets/48938733/d47fe162-d920-4572-94f2-38f149bc1548">

<img width="657" alt="Screenshot 2024-04-20 at 11 39 15 PM" src="https://github.com/subramanyaganesh/FetchCodingExercise/assets/48938733/6f346c24-9d2e-420c-a417-479a357b5300">






