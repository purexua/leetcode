// Source : https://leetcode.com/problems/zigzag-conversion/
// Author : Purexua
// Date   : 2023-08-12

/********************************************************************************** 
* 
* The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this: 
* (you may want to display this pattern in a fixed font for better legibility)
* 
* P   A   H   N
* A P L S I I G
* Y   I   R
* 
* And then read line by line: "PAHNAPLSIIGYIR"
* 
* Write the code that will take a string and make this conversion given a number of rows:
* 
* string convert(string text, int nRows);
* 
* convert("PAYPALISHIRING", 3) should return "PAHNAPLSIIGYIR".
* 
*               
**********************************************************************************/

class Solution {
    public String convert(String s, int numRows) {
        if(numRows==1) return s;
        
        String[] arr = new String[numRows];
        Arrays.fill(arr,"");
        char[] chars = s.toCharArray();
        int len = chars.length;
        int period = numRows * 2 - 2;
        for(int i=0;i<len;i++)
        {
            int mod = i % period;
            if(mod < numRows)
            {
                arr[mod] +=chars[i];
            }else{
                arr[period - mod] += String.valueOf(chars[i]);
            }
        }
        StringBuilder res = new StringBuilder();
        for(String ch : arr){
            res.append(ch);
        }
        return res.toString();
    }
}