import { useEffect, useState } from "react";
import CardDTO from "../../../components/CardDTO";
import { UserDTO } from "../../../models/UserDTO";
import * as userService from "../../../services/user-service"


export default function DTO() {

  const[usersDTO, setUsersDTO] = useState<UserDTO[]>([]);

  useEffect(() => {
    userService.findAll()
    .then((response) => {
      setUsersDTO(response.data);
    })
  },[])

  return (
    <main className="max-w-[1240px] container mx-auto py-10">
      <div className="grid grid-cols-3 justify-items-center gap-y-10">
        {
          usersDTO.map((user) => (
            <CardDTO user={user} key={user.id} />
          ))
        }
      </div>
    </main>
  );
}
