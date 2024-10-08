import { useEffect, useState } from "react";
import CardMinDTO from "../../../components/CardMinDTO";
import { UserMinDTO } from "../../../models/UserMinDTO";
import * as productService from "../../../services/product-service"

export default function MinDTO() {

  const[usersMinDTO, setUsersMinDTO] = useState<UserMinDTO[]>([]);

  useEffect(() => {
    productService.findMinAll().then((response) => {
      setUsersMinDTO(response.data);
      console.log(response.data);
      
    })
  },[])


  return (
    <main className="max-w-[1240px] container mx-auto py-10">
      <div className="grid grid-cols-4 justify-items-center gap-y-10">
        {
          usersMinDTO.map((user) => (
            <CardMinDTO user={user} key={user.id}/>
      
            
          ))
        }
      </div>
    </main>
  );
}
