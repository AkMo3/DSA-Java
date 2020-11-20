### DSA- Java
  1. This Is A Repositry that is meant to contain all new Data Structures And Algorithms of Java along with other codes like of Crytography, Dynamic Programming, and some medium-large size codes also like of Andoid Development.
  2. Codes are divided into different folders according to their classification like Algorithms, search, datastructure.
### Usage 
  1. Import package by
     `import {DIRECTORY_TYPE}.{FOLDER_NAME}.{FILE_NAME}.{CLASS_NAME_IF_APPLICABLE};`  
     Example :- `import algorithms.search.BinarySearch;`  
  2. Create instance of class by 
     `{CLASS_NAME}<> {IDENTIFIER_OF_YOUR_CHOICE} = new {CLASS_NAME}<>({PARAMETER_IF_ANY});`  
     Example :- `BinarySearch<Integer> bs = new BinarySearch<Integer>(a);`  
  3. Use functions of class by `{IDENTIFIER}.{FUNCTION_OF_CLASS}({PARAMETER_IF_ANY});`  
      Example :- `return bs.search(23);`
  4. Found issue : Please inform us by making a new Issue in [Issues](https://github.com/AkMo3/DSA-Java/issues).
  
  ### Contribution Guide :octocat:
  
  First, we would congratulate you for joining our community:wave:. A warm welcome from our side:tada:. We look forward to your jounery with us. :boom:
  
  Setting Environment :
   1. Fork this repository.
   2. Clone into your local repository 
      `git clone git@github.com:{YOUR_USERNAME}/DSA-Java.git`
   3. Change to a new branch 
      `git checkout -b {BRANCH_NAME}`
   4. Write your code.
   5. Commit changes of your code 
      `git add *`
      `git commit -m "{COMMIT_MESSAGEE}"`
   6. Push to git
      `git push origin {BRANCH_NAME}`
  
  First some ground rules :
   1. If making a PR for a existing issue commit message should be `Fixes: #{ISSUE_NO}`.
   2. If Issue doesn't exist add want to add a new featuer or change, make a Issue first and follow rule **1**.
   3. Complete the PR templete and fill required feilds, otherwise PR may not be considered.
   4. PR should pass all the automated test.
   5. The main working class should be `{FILE_NAME}`. Also the main() function should be comented showing how calling of class and using some of its function. While this may not always be possible.
   6. Code should be Generic if a algorithm or Data Structure.
   7. Format code before submitting with [google-java-format](https://github.com/google/google-java-format/). Run the following codes in your directory- 
      1. `wget https://github.com/google/google-java-format/releases/download/google-java-format-1.9/google-java-format-1.9-all-deps.jar -O formatter.jar`
      2. `java -jar formatter.jar --replace --set-exit-if-changed {FILE_NAME.java}`
   
  Enough of rules now, Join our community to talk with fellow members and learn. [![Gitter chat](https://img.shields.io/badge/Chat-Gitter-ff69b4.svg?label=Chat&logo=gitter&style=flat-square&color=blue)](https://gitter.im/DSA-Java/community)&nbsp;
