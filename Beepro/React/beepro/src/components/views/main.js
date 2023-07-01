import React from 'react';

import Beepro from "./beepro"
import School from "./school"

function Main (){
    const queryParameters = new URLSearchParams(window.location.search)
    const school = queryParameters.get("school")
    const store = queryParameters.get("store")
    return (
        <div>
            {
                store !== "active" &&
                <Beepro />
            }
            {
                store === "active" &&
                <School data={school}/>
            }
        </div>
    );
}

export default  Main;