

SPECIAL_CHARS = '.,-_@' as List // Change this list as needed.

def isValid(str) {
    def hasMinium      = str.length() > 4
    def hasUpperCase   = str.find(/\p{Lu}/)
    def hasDigit       = str.find(/\p{N}/)
    def hasSpecialChar = str.any { it in SPECIAL_CHARS }
    hasUpperCase && hasDigit && hasSpecialChar
}




return isValid('Nibi@')
/*
assert !isValid('Asd')
assert !isValid('Asd1')
assert  isValid('Asd1.')
assert !isValid('correct horse battery staple')
assert  !isValid('?.?')
*/