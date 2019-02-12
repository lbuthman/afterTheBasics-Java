
## Additive Persistence

1. What are the two arguments for the function?

2. Is the meaning of the parameter named `num` immediately obvious? If not, what would be a better, [self-documenting](https://stackoverflow.com/questions/209015/what-is-self-documenting-code-and-can-it-replace-well-documented-code) 
name be?

3. What is the `radix` argument? Why are we checking to see if it is less than 2?

4. What is the first condition in the if statement on Line 8? How does the function `compareTo()` work? (Hint: You can 
jump to it’s definition using the IDE. Research how to if unsure. Keep it simple by just reading the comments, paying 
close attention to `@return`.)

5. Looking at the if statement on Line 8 as a whole, what is it doing precisely?

6. Why is the variable `biRadix` created?

7. Why does the for loop use the variable `count` instead of something more common like `i`?

8. What is the meaning of `++count` on Line11? What happens if you change it to `count++`?

9. Add breakpoints on Lines 14, 15 and 17. Run the unit test in debug mode. Do your best to follow the algorithm for 
calculating the Additive Persistence number. One trick is to try to predict the value of the variable being set before 
it is executed.


## Resources

- [Additive Persistence](http://mathworld.wolfram.com/AdditivePersistence.html)
- [Using the IntelliJ Debugger](https://www.youtube.com/watch?v=w7W9kDgHP2k) (please conduct own search if using other IDE)