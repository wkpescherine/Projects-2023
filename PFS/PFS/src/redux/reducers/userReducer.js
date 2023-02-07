const initialState = {
    username: ""
}

export default (state = initialState, action) => {
    switch (action.type){
        case 'USER_NAME': 
            return {
            username: state
        }
    }
}