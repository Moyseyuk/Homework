package com.company.Lesson7.Task3.Register;

import com.company.Lesson7.Task3.Document;

public class Register {
    private Document[] documents = new Document[10];

    public void addDocument(Document document) {
        for (int count = 0; count < this.documents.length; count++){
            if(this.documents[count] == null){
                this.documents[count] = document;
                break;
            }
        }
    }

    public void printDocument() {
        for (Document document : this.documents) {
            if (document != null) {
                document.printInfo();
            }
        }
    }
}
