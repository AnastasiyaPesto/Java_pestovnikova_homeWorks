package ru.pestovnikova.Lesson4;

public class MessageStore {
    private Message[] arrayMessage;

    public MessageStore(Message[] arrayMessage) {
        this.arrayMessage = arrayMessage;
    }

    public MessageStore(){
        this.arrayMessage = null;
    }

    public MessageStore(int n){
        arrayMessage = new Message[n];
    }

    public void add(Message message){
        for(int i = 0; i < arrayMessage.length; i++){
            if (arrayMessage[i] == null){
                arrayMessage[i] = message;
                break;
            }
        }
    }
}
