#!/usr/bin/perl

## Email address validation.
print "Email address validation.\n";
my $email = 'xiaeryu@u.nus.edu';
if($email =~ /^[^@]+@\w+\.\w+\S*$/){
        print "Correct email address!\n";
}else{
        print "Incorrect email address!\n";
}

## Match Href in html files.
print "\nMatch Href in html files.\n";
my $patternString = "\s*(href|src)\s*=\s*(\"([^\"]*\")|(\'[^\']*\')|([^\'\">\s]+))";
my $text = "<a href=\"http://aaa.htm\">bbb</a> <img src=\"http://bb.com/pic.jpg\">";
while($text =~ /$patternString/ig){
        print "Page: $2\n";
}

## Replacement.
print "\nReplacement.\n";
my $text2 = 'one cat, two cats in the yard';
$text2 =~ s/cat/big cat/g;
print "$text2\n";

## Split based on regular expression.
print "\nSplit.\n";
my $text3 = 'one,two, three   four ,  five ';
my @result = split(/[, \s]+/,$text3);
for(my $i=0;$i<=$#result;$i++){
        print "**$result[$i]**\n";
}
