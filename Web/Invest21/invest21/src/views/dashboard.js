import '../App.css';
import {useNavigate} from 'react-router-dom'

function Dashboard(){
    let navigate = useNavigate();

    function RedirectTo(page){
        if(page ==="home"){
            console.log("Clicked home")
            navigate('/dashboard')
        }
        if(page === "profile"){
            console.log("Clicked profile")
            navigate('./profile')
        }
    }
    return (
        <div>
            <p>Invest21</p>
            <p>Dashboard</p>
            <button onClick={() => RedirectTo("profile")}>Profile</button>
            <button onClick={() => RedirectTo("home")}>Home</button>
        </div>
    );
}

export default Dashboard;