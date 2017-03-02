# codeguide
#Don't repeat yourself
Adding additional, unnecessary code to a codebase increases the amount of work required to extend and maintain the software in the future.  Duplicate code adds to technical debt.  Whether the duplication stems from Copy Paste Programming or poor understanding of how to apply abstraction, it decreases the quality of the code.  Duplication in process is also waste if it can be automated.  Manual testing, manual build and integration processes, etc. should all be eliminated whenever possible through the use of automation.
```java
int[] a = {1,2,3,4,5};
int[] b = {3,5,7,9};

int sum_a = 0;
// to find sum of array a.
for(int i = 0;i< a.lenght;i++){
  sum += a[i];
}

//to find sum of array b.
for(int i = 0;i< b.lenght;i++){
  sum += b[i];
}
```
From the example above. We have to write 2 for loop to find sum of 2 arrays. This is kind of duplicate code that we should eliminate.So we can rewrite by using a method to do a task so when we want to find sum of any array we just call this method.
```java
public int FindSum(int[] array){
  int sum = 0;
  for(int i = 0;i < array.lenght;i++){
  sum += array[i];
  }
  return sum;
}
```
The method above is for finding sum of an int array so we don't have to write a duplicate code so it will be

```java
int[] a = {1,2,3,4,5};
int[] b = {3,5,7,9}

//print sum of a
System.out.println(FindSum(a));

//print sum of b
System.out.println(FindSum(b));
```
This is one way for eliminate a duplicate code.

Exercise : https://github.com/pawan1235/codeguide/blob/master/src/codeguide/Exercise1.java

Reference: http://deviq.com/don-t-repeat-yourself/

#Consistenly follow a coding convention(coding standard)

For writing a food code naming class,constant,etc. is very important.It may seem not important if you are write it for yourself alone but when it come to an organization or teams. It is very important to name it easy to understand for every one. Here is Rules for nameing.

<strong>Package</strong> : The prefix of a unique package name is always written in all-lowercase ASCII letters and should be one of the top-level domain names, currently com, edu, gov, mil, net, org, or one of the English two-letter codes identifying countries as specified in ISO Standard 3166, 1981.

<strong>Example</strong> : com.sun.eng


<strong>classes</strong> : Class names should be nouns, in mixed case with the first letter of each internal word capitalized. Try to keep your class names simple and descriptive. Use whole words-avoid acronyms and abbreviations (unless the abbreviation is much more widely used than the long form, such as URL or HTML).

<strong>Example</strong> : class CoinPurse, class StopWatch


<strong>Interfaces</strong> : Interface names should be capitalized like class names.

<strong>Example</strong> : interface Valuable, interface StopWatch


<strong>Methods</strong> : Methods should be verbs, in mixed case with the first letter lowercase, with the first letter of each internal word capitalized.

<strong>Example</strong> : FindSum(); , getValue();


<strong>Variable</strong> : Except for variables, all instance, class, and class constants are in mixed case with a lowercase first letter. Internal words start with capital letters. Variable names should not start with underscore _ or dollar sign $ characters, even though both are allowed.

Variable names should be short yet meaningful. The choice of a variable name should be mnemonic- that is, designed to indicate to the casual observer the intent of its use. One-character variable names should be avoided except for temporary "throwaway" variables. Common names for temporary variables are i, j, k, m, and n for integers; c, d, and e for characters.

<strong>Example</strong> : int sum; , String name;


<strong>Constants</strong> : The names of variables declared class constants and of ANSI constants should be all uppercase with words separated by underscores ("_"). (ANSI constants should be avoided, for ease of debugging.)

<strong>Example</strong> : MAX_VALUE = 1000; , DEFAULT_CURRENCY = "Baht"

Exercise = https://github.com/pawan1235/codeguide/blob/master/src/codeguide/exercise2.java

Reference : http://www.oracle.com/technetwork/java/codeconventions-135099.html
