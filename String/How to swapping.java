
// On Char[] array : eg -> ['a','b','c','d']


char[] array = {'a', 'b', 'c', 'd'};
int index1 = 1; // index of the first element to swap
int index2 = 2; // index of the second element to swap

Arrays.swap(array, index1, index2);




//-On String  eg -> "abcd"


String str = "abcd";

int index1 = 1; // index of the first character to swap
int index2 = 2; // index of the second character to swap

StringBuilder sb = new StringBuilder(str);

sb.setCharAt(index1, str.charAt(index2));

sb.setCharAt(index2, str.charAt(index1));

String swappedStr = sb.toString();
