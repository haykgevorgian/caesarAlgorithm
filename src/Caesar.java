import java.io.*;

public class Caesar {

    static void coder(String absoluteFilePath, int key) {
        String file = "";
        int letterKey = key % 26;
        int numberKey = key % 10;
        StringBuilder sbToReturn = new StringBuilder();
        StringBuilder sb = new StringBuilder();
        try {
            BufferedReader br = new BufferedReader(new FileReader(absoluteFilePath));
            String line;
            while ((line = br.readLine()) != null) {
                sb.append(line).append("\n");
            }
            br.close();
            file = sb.toString();
        }
        catch (IOException e) {
            e.printStackTrace();
            return;
        }
        for (int i = 0; i < file.length(); i++) {
            char ch = file.charAt(i);
            if(ch >= 'a' && ch <='z') {
                if(ch + letterKey > 'z') {
                    ch -= 26;
                }
                sbToReturn.append((char)(ch + letterKey));
            } else if (ch >= 'A' && ch <='Z') {
                if(ch + letterKey > 'Z') {
                    ch -= 26;
                }
                sbToReturn.append((char)(ch + letterKey));
            } else if (ch >= '0' && ch <= '9') {
                if(ch + numberKey > '9') {
                    ch -= 10;
                }
                sbToReturn.append((char)(ch + numberKey));
            }
            else {
                sbToReturn.append(ch);
            }
        }
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("output.txt"));
            bw.write(sbToReturn.toString());
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    static void decoder(String absoluteFilePath, int key) {
        key = -key;
        String file = "";
        int letterKey = key % 26;
        int numberKey = key % 10;
        StringBuilder sbToReturn = new StringBuilder();
        StringBuilder sb = new StringBuilder();
        try {
            BufferedReader br = new BufferedReader(new FileReader(absoluteFilePath));
            String line;
            while ((line = br.readLine()) != null) {
                sb.append(line).append("\n");
            }
            br.close();
            file = sb.toString();
        }
        catch (IOException e) {
            e.printStackTrace();
            return;
        }
        for (int i = 0; i < file.length(); i++) {
            char ch = file.charAt(i);
            if(ch >= 'a' && ch <='z') {
                if(ch + letterKey > 'z') {
                    ch -= 26;
                }
                sbToReturn.append((char)(ch + letterKey));
            } else if (ch >= 'A' && ch <='Z') {
                if(ch + letterKey > 'Z') {
                    ch -= 26;
                }
                sbToReturn.append((char)(ch + letterKey));
            } else if (ch >= '0' && ch <= '9') {
                if(ch + numberKey > '9') {
                    ch -= 10;
                }
                sbToReturn.append((char)(ch + numberKey));
            }
            else {
                sbToReturn.append(ch);
            }
        }
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("output.txt"));
            bw.write(sbToReturn.toString());
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
