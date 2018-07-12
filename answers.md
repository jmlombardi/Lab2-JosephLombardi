Joseph Lombardi
###Lab2
[Click here for My GitHub Lab 2 Repository](https://github.com/jmlombardi/Lab2-JosephLombardi)
####Due 06/13/2018
####Discussion Questions



1. What is the complexity of each of the four search methods in terms of array or list size n?

	The first three search methods have a linear time complexity or O(n). As the size of the input increases, the time increases linearly. These methods will search every element in order until it finds your argument or until it doesn't find your argument.

    findTeamMinFundingFast uses Binary Search and has an order of complexity of (log n). It uses a divide and conquer method of ruling out half of the array over and over again until your arguent is found or not found.
	

2. What happens in the case of binary search if the array is not sorted?

    Chances are you will not find for value. For example consider the following array.
    [1, 8, 5, 3, 10]

    Let's say we are searching for 3. 5 is going to be our current middle element. Binary search is going to check if 3 is less than or greater than 5. 3 is less than 5 so it is going to search on the left side and eliminate the right side of your array now. 3 is actually on the right side and it will not find 3. This is why the array has to be sorted.

3. What is the purpose of constructor argument validity checking?
    
    Most methods and constructors have restrictions on what values may be passed to their parameters. It is not uncommon that index values must be positive and object references must be non-null. It is much safer for a constructor or method to check its pararmeters before execution because it will fail clean and quick with an appropriate exception vs. it failing with a confusing exception during processing.

4.  What is the purpose of using the keyword final with variables and arguments?


    The final keyword is a non-access modifier.  The final keyword can be used in different contexts in Java programming. You can declare a variable, class or method as final. 
 
    When you declare a variable as final, it means it is a constant value and will not change. A perfect example of when you want want a variable to be declared final is a birthday. That is because your birthday will never change and you don't want anyone else to change your birthday. When you declare a method as final, that means the method cannot be overloaded.

    When you declare a class as final you are preventing inheritance. A final class cannot be extended in any program. Java's predefined String class is immutable because it is declared as a final class.

    Declaring a method as final prevents the method from being overridden. An example of a method that is not final is the toString method. If toString() was declared final, it wouldn't be able to be overridden for so many different class objects.


5. What are alternatives to using Optional and how do they compare?
   
    An alternative to using the the Optional class is simply checking for null like with an if statement. See my example below.

  ```
            Person joe = new Person();
  ```

        if(joe.getAge() != null) {
          int age = joe.getAge();
        }
