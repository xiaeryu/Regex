import re

## Email address validation.
print "Email address validation."
email = 'xiaeryu@u.nus.edu';
pattern1 = re.compile('^[^@]+@\w+\.\w+\S*$')
if re.search(pattern1, email):
    print "Correct email address!"
else:
    print "Incorrect email address!"

## Match Href in html files.
print "\nMatch Href in html files."
pattern2 = re.compile("\s*(href|src)\s*=\s*(\"([^\"]*\")|(\'[^\']*\')|([^\'\">\s]+))")
text = "<a href=\"http://aaa.htm\">bbb</a> <img src=\"http://bb.com/pic.jpg\">"
for match in re.finditer(pattern2,text):
    print "Page:" + match.group(2)

## Replacement.
print "\nReplacement."
pattern3 = re.compile("cat")
text2 = 'one cat, two cats in the yard'
print re.sub(pattern3,'big cat',text2)

## Split based on regular expression.
print "\nSplit."
text3 = 'one,two, three   four ,  five '
result = re.split("[, \s]+",text3)
print result
