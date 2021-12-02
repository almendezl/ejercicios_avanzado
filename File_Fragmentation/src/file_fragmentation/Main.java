/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package file_fragmentation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        // TODO Auto-generated method stub
        //pc2Read();
        String vec[] = {"1", "011", "0111", "11111", "111", "0111", "111110"};
        process(vec);
    }

    public static void process(String vec[]) {
        String max1 = "";
        String max2 = "";
        for (int i = 1; i < vec.length; i++) { //escoger los dos mayores
            if (vec[i].length() <= max1.length()) {
                if (vec[i].length() > max2.length()) {
                    max2 = vec[i];
                }
            } else {
                max1 = vec[i];
            }
        }

        //proceso
        int j = 0;
        for (int i = 0; i < max1.length(); i++) {
            if (max1.substring(i, i + 1).equals(max2.substring(j, j + 1))) { //si son iguales
                int p = 1;
                int m = i + 1;
                if (m < (max1.length()) && p < (max2.length())) {
                    while (max1.substring(m, m + 1).equals(max2.substring(p, p + 1))) { 
                        if (m == (max1.length() - 1)) {
                            max1 += max2.substring(p + 1, max2.length());
                            System.out.println(max1);
                            return;
                        }
                        m++;
                        p++;
                    }
                } else {
                    max1 += max2.substring(p, max2.length());
                }
            }
        }
        System.out.println(max1);

    }

    public static void pc2Read() throws IOException {
        String line, vec[]=null;

        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        try {
           while((line = buffer.readLine()).length()>0){
               vec = line.split(" ");
               process(vec);
           }
        } catch (NullPointerException e) {
        }
        buffer.close();
    }

}
