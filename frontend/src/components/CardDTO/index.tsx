import { UserDTO } from "../../models/UserDTO";

type Props = {
  user: UserDTO;
}

export default function CardDTO({user}: Props) {
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
        <blockquote>
          <p className="text-lg font-medium">
            {user.description}
          </p>
        </blockquote>
        <figcaption className="font-medium">
          <div className="text-sky-500 dark:text-sky-400">{user.username}</div>
          <div className="text-slate-700 dark:text-slate-500">
            {user.email}
          </div>
        </figcaption>
      </div>
    </figure>
  );
}
