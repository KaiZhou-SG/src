# 2014-08-29 Zhou Kai, I think there are different memory models for different
# programming languages, it's very interesting to know about the memory model
# of a programming language.
# 2014-08-12 Zhou Kai writes this program to learn and practice the concept of
# memory model.

def f(x):                      # line 1
    x = x * 2                  # line 2
    return x                   # line 3
                               # line 4
x = 1                          # line 5
x = f(x + 1) + f(x + 2)        # line 6
                               # line 7
print(x)                       # line 8

# Let's analysis the memory model:
# 1. Divide the whole memory into two separate parts: Frame and Object.
# 2. The program starts from shell, so first of all, a shell namespace is 
#  created in the Frame, and nothing in the Object yet.
# 3. When the program goes to function definition, #line 1, a name f is
#  created in shell namespace in Frame, and a function object is created in
#  Object. So now, in the Frame part, we have a shell namespace, and inside
#  the shell namespace, we have a name called f; In the Object part, we have
#  a function object, which corresponds to f in shell namespace.
# 4. The program goes to #line 5(the function body won't be executed untill the
#  function is called), the current namespace goes back to shell, and 
#  creates a name x and creates an object 1 in Object.
# 5. The program goes to #line 6. The program execute from the right side of =,
#  and execute from left to righ on the right side of =.
# 6. The f(x+1) is going to be executed, a namespace f is created in shell 
#  namespace and the current namespace comes to f, the argument is evaluated 
#  first.
# 7. When evaluating the argument x + 1, looking for the name x in above
#  namespace, the shell namespace. And object 1 is found for name x in Object.
# 8. After the argument x + 1 is evaluated to 2, the program goes into the f
#  namespace, and #line 2 and #line 3 are executed.
# 9. When execute #line 2, a name x is created in namespace f, it points to
#  object 2 in Object.
# 10. When execute #line 3, the name x in namespace f points to a new object
#  6, the object 4 is created in Object. The result of f(x+1) is 4.
# 11. The same thing happes to f(x + 2), the result of it is 6.
# 12. The namespace goes back to the shell namespace, and the name x now points
# to 10, the object 10 is created in Object.
# Please refer to the book "A Proactical Guide to Programming using Python 2nd"
# page 58.
