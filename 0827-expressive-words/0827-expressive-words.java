class Solution {
    public int expressiveWords(String emp, String[] strs) {
        StringBuilder empabbr = new StringBuilder();
        for( int i = 0 ; i< emp.length() ;i++){
            char c = emp.charAt(i);
            int count = 1 ;
            while( i+1< emp.length() && c == emp.charAt(i+1)){
                c = emp.charAt(++i);
                count++;
            }
            empabbr.append(emp.charAt(i));
            empabbr.append(count);
        }
        String empstr = empabbr.toString();
        int ans  = 0 ;
        for( String s : strs){
            StringBuilder abbr = new StringBuilder();
            for( int i = 0 ; i< s.length() ;i++){
                char c = s.charAt(i);
                int count = 1 ;
                while( i+1< s.length() && c == s.charAt(i+1)){
                    c = s.charAt(++i);
                    count++;
                }
                abbr.append(s.charAt(i));
                abbr.append(count);
            }
            String sabbr = abbr.toString();
            System.out.println(empstr + " "+sabbr);
            int i = 0 ;
            int j = 0 ;
            boolean flag = true;
            if(empstr.length() != sabbr.length()) continue;
            while( i < empstr.length() && j < sabbr.length()){
                // System.out.print(i+" ");
                char c1 = empstr.charAt(i);
                char c2 = sabbr.charAt(j);
                if(c1!=c2){
                    flag = false;
                    break;
                }
                i++;
                j++;
                int n1 = empstr.charAt(i) - '0';
                int n2 = sabbr.charAt(j) - '0';
                if ((n1 < 3  && n1!=n2)|| n1 < n2) {
                    flag = false;
                    break;
                }
                i++;
                j++;

            }
            if(flag ) ans++;
        }
        return ans;
    }
}