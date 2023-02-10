import { SET_USERNAME } from "../constants";

export function
setUsername(username){
    return{
        type: SET_USERNAME,
        payload: username
    }
}

//export const user = () => {
//    return {
//        type: "USER_NAME",
//    };
//};