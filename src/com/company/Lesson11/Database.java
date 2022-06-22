package com.company.Lesson11;

import java.util.Arrays;

public class Database {

    public String[] strings;

    public Database() {
        this.strings = new String[5];
    }

    public String getStrings() {
        String str = this.strings[0];
        if (this.strings[4] == null){
            for (int count = 1; count < this.strings.length; count++){
                this.strings[count - 1] = this.strings[count];
            }
        } else {
            for (int count = 1; count < this.strings.length; count++){
                this.strings[count - 1] = this.strings[count];
            }
            this.strings[4] = null;
        }
        return str;
    }

    public void setStrings(String str) {
        for (int count = 0; count < this.strings.length; count++){
            if (this.strings[count] == null){
                this.strings[count] = str;
                break;
            }
        }
    }

    @Override
    public String toString() {
        return "DB{" +
                "strings=" + Arrays.toString(strings) +
                '}';
    }
}
