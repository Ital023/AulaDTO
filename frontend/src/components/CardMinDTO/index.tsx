import { UserMinDTO } from "../../models/UserMinDTO";

type Props = {
  user: UserMinDTO
}


export default function CardMinDTO({user} : Props) {
  return (
    <figure className="bg-slate-100 rounded-xl p-8 max-w-80">
      <img
        className="w-24 h-24 rounded-full mx-auto"
        src={user.imgUrl}
        alt={user.username}
        width="384"
        height="512"
      />
      <div className="pt-6 text-center space-y-4">
          <div className="font-bold w-40 max-w-40 truncate overflow-hidden text-ellipsis whitespace-nowrap">{user.username}</div>
      </div>
    </figure>
  );
}
