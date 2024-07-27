// 28. Find the Index of the First Occurrence in a String

// Approach 1
// TC : O(m * n)
// public class indexOfFirstOccurance {
//     public int strStr(String haystack, String needle) {
//         int sizem = haystack.length();
//         int sizen = needle.length();

//         if(sizem < sizen) return -1;

//         for(int i=0; i<=sizem-sizen; i++) {
//             int j = 0;
//             while(j < sizen && haystack.charAt(i+j) == needle.charAt(j)) {
//                 j++;
//             }
//             if(j == sizen) return i;
//         }

//         return -1;
//     }
// }


// Approach 2

public class indexOfFirstOccurance {
    public int strStr(String haystack, String needle) {
        int sizem = haystack.length();
        int sizen = needle.length();
        int i = 0;
        int j = 0;
        int ansIndex = 0;

        if(sizem < sizen) return -1;

        while(i < sizem  && j <sizen) {
            char ch1 = haystack.charAt(i);
            char ch2 = needle.charAt(j);

            if(ch1 == ch2) {
                i++;
                j++;
            }
            else {
                j = 0;
                i = ansIndex + 1;
                ansIndex = i;
            }
        }

        if(j == sizen) return ansIndex;

        return -1;
    }
}