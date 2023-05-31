import { useNavigate } from "react-router-dom";

const LoginForm = (user) => {
  const navigate = useNavigate();
  const onSubmit = () => {
    navigate("/products");
  };

  const onCancel = () => {
    navigate("/");
  };

  return (
    <form className="SignUpForm" onSubmit={onSubmit}>
      {user && <input type="hidden" name="_id" defaultValue={user._id} />}

      <div className="control">
        <label htmlFor="name">Username:</label>
        <input
          defaultValue={user ? user.userName : null}
          name="name"
          id="name"
        />
      </div>

      <div className="control">
        <label htmlFor="level">Password:</label>
        <input
          defaultValue={user ? user.passWord : null}
          name="level"
          id="level"
        />
      </div>

      <div className="buttons">
        <button type="submit">Login </button>
        <button type="button" onClick={onCancel}>
          Cancel
        </button>
      </div>
    </form>
  );
};

export default LoginForm;
