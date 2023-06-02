import "../css/LandingPage.css";
import logo from "../Images/prelovedlogo.png";
import { Link } from "react-router-dom";

const LandingPage = () => {
  return (
    <div className="landingPage">
      <img src={logo} alt="logo"className="image"></img>
      <h1 className="welcometext">Welcome to PreLoved!</h1>
      <div className="buttonContainer">
      <Link to={"/signup"}>
        <button type="button" className="landingButton">Sign up</button>
      </Link>
      <Link to={"/login"}>
        <button type="button" className="landingButton">Login</button>
      </Link>
      </div>
    </div>
  );
};

export default LandingPage;
