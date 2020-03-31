package com.example.sharelibrary;

public class ServiceFactory {
    private static final ServiceFactory instance = new ServiceFactory();

    private IMyPushService mMyPushService;

    private ServiceFactory() {
    }

    public static ServiceFactory getInstance() {
        return instance;
    }

    public IMyPushService getMyPushService() {
        if (mMyPushService == null) {
            mMyPushService = new EmptyMyPushService();
        }
        return mMyPushService;
    }

    public void setMyPushService(IMyPushService mMyPushService) {
        this.mMyPushService = mMyPushService;
    }

}

