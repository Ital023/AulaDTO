import { useEffect, useState } from "react";
import CardMinDTO from "../../../components/CardMinDTO";
import * as userService from "../../../services/user-service"
import { UserMinDTO } from "../../../models/UserMinDTO";


export default function MinDTO() {

  const [usersMinDTO, setUsersMinDTO] = useState<UserMinDTO[]>([]);

  useEffect(()=>{
    userService.findMinAll()
    .then((response) => {
      setUsersMinDTO(response.data);
    })
  },[])


  return (
    <main className="max-w-[1240px] container mx-auto py-10">
      <div className="grid grid-cols-4 justify-items-center gap-y-10">
        {
          usersMinDTO.map((user) => (
            <CardMinDTO user={user} key={user.id} />
          ))
        }
      </div>
    </main>
  );
}
