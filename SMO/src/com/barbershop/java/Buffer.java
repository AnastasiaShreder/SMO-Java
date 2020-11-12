package com.barbershop.java;

public class Buffer {
    private int size;
    private Request [] queue;

    public boolean isCompleted(){
        for (int i = 0; i < size;i++){
            if (queue[i] == null) {
                return false;
            }
        }
        return true;
    }

    public int addRequestToBuffer(Request request){
        for (int i = 0; i < size;i++){
            if (queue[i] != null){
                queue[i] = new Request(request.getSourcePriority(), request.getRequestNumber(),request.getArrivalTimeSystem(), request.getArrivalTimeBuffer(),0,0,0);
                return i;
            }
        }
        return -1;
    }

    public Request getRequest(){
        int numReqToGet = 0;
        boolean isSelectedReq = false;
        for (int i = 0; i < size;i++){
            if (queue[i] != null) {
                if (!isSelectedReq) {
                    numReqToGet = i;
                    isSelectedReq = true;
                }

                if (queue[i].getSourcePriority() < queue[numReqToGet].getSourcePriority()) {
                    numReqToGet = i;
                } else if (queue[i].getSourcePriority() == queue[numReqToGet].getSourcePriority()) {
                    if (queue[i].getSourcePriority() > queue[numReqToGet].getSourcePriority()) {
                        numReqToGet = i;
                    }
                }
            }
            if (!isSelectedReq) {
                numReqToGet = i;
            }
        }
        return queue[numReqToGet];
    }

    public Buffer(Request [] queue, int size) {
        this.queue = queue;
        this.size = size;
        for (int i = 0; i < size; i++) {
            queue[i] = null;
        }
    }
}
