package com.FoodForThought.loginregisterFFT;

interface GetUserCallback {

    /**
     * Invoked when background task is completed
     */

    public abstract void done(User returnedUser);
}
