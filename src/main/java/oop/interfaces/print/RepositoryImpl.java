package oop.interfaces.print;

public class RepositoryImpl implements Repository {
    @Override
    public void write(String text) {
        if (text != null){
            //some logic
        }
    }

    @Override
    public String read() {
        String result = "";
        //get text
        return result;
    }

    @Override
    public boolean update(String newText) {
        String oldText = "old";
        String updatedText = newText;
        //save new text
        return true;
    }

    @Override
    public boolean delete(int code) {
        return false;
    }
}
