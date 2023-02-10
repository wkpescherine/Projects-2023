import { SET_USERNAME } from "../constants"

const initialState = {
    username: ""
}

const userReducer = (state = initialState, action) => {
        switch (action.type){
            case SET_USERNAME: 
                return {
                    ...state,
                    username: action.payload
            }
        }
    }

export default userReducer;

//export default (state = initialState, action) => {
//    switch (action.type){
//        case 'USER_NAME': 
//            return {
//            username: state
//        }
//    }
//}