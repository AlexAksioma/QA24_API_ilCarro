package api;

import okhttp3.MediaType;

import java.awt.*;

public interface BaseApi {
    String BASE_URL = "https://ilcarro-backend.herokuapp.com";
    String LOGIN_URL = "/v1/user/login/usernamepassword";
    String REGISTRATION_URL = "/v1/user/registration/usernamepassword";
    String ADD_NEW_CAR_URL = "/v1/cars";
    String DELETE_CAR_BY_SERIAL_NUMBER_URL = "/v1/cars/";
    MediaType JSON = MediaType.get("application/json");

    String EMAIL = "789baggins_bilbo@mail.com";
    String PASSWORD = "Zxc12345!";

}
