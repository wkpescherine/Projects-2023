import React, {useState} from 'react';
import './App.css';
import {Link, useNavigate} from 'react-router-dom'

function Main() {
    const[logInUsername,setLogInUsername] = useState ("");
    const[logInPassword,setLogInPassword] = useState ("");

    let logInStatus = "None";
    let navigate = useNavigate();
    
    const handleLogInUsernameChange = (event) => {
        setLogInUsername(event.target.value)
    }

    const handleLogInPasswordChange = (event) => {
        setLogInPassword(event.target.value)
    }
    
    function RedirectTo(){
        navigate('./dashboard')
    }

    return (
        <div>
            <p>Invest21</p>
            <p>
                <input type="text" placeholder="Enter username" onChange={handleLogInUsernameChange}></input>
            </p>
            <p>
                <input type="text" placeholder="Enter password" onChange={handleLogInPasswordChange}></input>
            </p>
            <p>
                <button onClick={RedirectTo}>Login</button> 
            </p>
        </div>
    );
}

export default Main;