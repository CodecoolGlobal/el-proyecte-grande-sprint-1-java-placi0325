import { useNavigate } from "react-router-dom";
import "../css/SignUpForm.css";

const SignUpForm = () => {
  const navigate = useNavigate();

  const onSubmit = () => {
    navigate("/products");
  };

  const onCancel = () => {
    navigate("/");
  };

  return (
    <div className="formholder">
      <form className="signupform" onSubmit={onSubmit}>
        <h1 className="header">Sign up</h1>
         <input type="hidden" name="_id" />

        <div className="control">
          <label htmlFor="name">Username:</label>
          <input
            name="name"
            id="name"
          />
        </div>

        <div className="control">
          <label htmlFor="level">Password:</label>
          <input
            name="level"
            id="level"
          />
        </div>

        <div className="buttons">
          <button className="button" type="submit">
            Sign up
          </button>
          <button className="button" type="button" onClick={onCancel}>
            Cancel
          </button>
        </div>
      </form>
    </div>
  );
};

export default SignUpForm;
