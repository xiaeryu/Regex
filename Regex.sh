## Email address validation.
echo "Email address validation."
awk 'BEGIN{email="xiaeryu@u.nus.edu";if(email ~ /^[^@]+@\w+\.\w+[^[:blank:]]*$/){print "Email address!"} else {print "Not email address"}}'

echo "xiaeryu@u.nus.edu" | gawk 'match($0, /^([^@]+)@\w+\.\w+[^[:blank:]]*$/, a) {print a[1]}'

## Replacement.
echo
echo "Replacement."
echo 'one cat, two cats in the yard' | sed 's/cat/big cat/g'

## Split based on regular expression.
echo
echo "Split."
echo 'one,two, three   four ,  five ' | awk 'BEGIN{FS="[, \t]+"}{ for (i = 1; i <= NF; i++) printf "**%s",$i}'; echo
