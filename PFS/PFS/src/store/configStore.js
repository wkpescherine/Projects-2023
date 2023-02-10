import { createStore , combineReducers} from "redux"

import userReducer from "../redux/reducers/userReducer"

const rootReducer = combineReducers(
    {
        username : userReducer
    }
)

const configStore = () => {
    return createStore(rootReducer)
}

export default configStore;