import java.io.*;
import java.util.ArrayList;
import java.util.List;
public class readFileTxt {
    public static void main(String[]args) throws IOException {
        String filePath = "C:\\laptrinh java\\User\\src\\User.txt";
        List<User> userList = new ArrayList<>();
        File file = new File(filePath);
        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);
        String line;
        while((line = br.readLine()) != null){
            String[]parts = line.split(",");
            String idString = parts[0].replace("(", "").trim();
            //System.out.println(idString);
            int id = Integer.parseInt(idString);
            String name = parts[1].replace("'", "").trim();
            String userName = parts[2].replace("'", "").trim();
            String password = parts[3].replace("'", "").trim();
            String email = parts[4].replace("'", "").trim();
            String role = parts[5].replace(")", "").replace("'", "").trim().trim();
            userList.add(new User(id,name,userName,password,email,role));
        }
        for (User user : userList) {
            System.out.println(user);
        }

    }
}
