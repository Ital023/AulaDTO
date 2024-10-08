import { Link, NavLink } from "react-router-dom";
import logo from "../../assets/logo.png";

export default function Header() {
  return (
    <header className="h-20 flex justify-center border-b-2">
      <div className="container lg:px-10 flex flex-row items-center justify-between h-full ">
        <Link to={"/home"}>
        <img src={logo} alt="logo" className="max-h-16" />

        </Link>
        
        <div className="flex flex-row gap-5 items-center">
          <NavLink
            to="/home"
            className={({ isActive }) =>
              isActive
                ? "menu-header-active"
                : ""
            }
          >
            Home
          </NavLink>
          <NavLink
            to="/minDTO"
            className={({ isActive }) =>
              isActive
                ? "menu-header-active"
                : ""
            }
          >
            UserMinDTO
          </NavLink>
          <NavLink
            to="/DTO"
            className={({ isActive }) =>
              isActive
                ? "menu-header-active"
                : ""
            }
          >
            UserDTO
          </NavLink>
        </div>
      </div>
    </header>
  );
}
