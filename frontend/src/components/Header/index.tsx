import logo from "../../assets/logo.png"


export default function Header() {
    return (
        <header className="h-20 flex justify-center content-center dark:bg-darkMode-tertiary border-b-2">
        <div className="container px-4 flex flex-row items-center justify-between h-full ">
          
        <img src={logo} alt="logo" className="max-h-16"/>

        
        </div>
      </header>
    );
}