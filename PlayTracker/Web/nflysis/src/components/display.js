import React from 'react';
import '../../src';
import { useNavigate} from 'react-router-dom'

function Display (){
    let navigate = useNavigate();
    
    function RedirectTo(){
        navigate('/')
    }

    return (
        <div style={{backgroundColor:"#999999", padding: 5,}}>
            <div>
                <p>Home: None Away: None</p>
            </div>

        </div>
    );
}

export default  Display;