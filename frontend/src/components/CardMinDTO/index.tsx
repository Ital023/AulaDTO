export default function CardMinDTO() {
  return (
    <figure className="bg-slate-100 rounded-xl p-8 max-w-80">
      <img
        className="w-24 h-24 rounded-full mx-auto"
        src="https://avatars.githubusercontent.com/u/113559117?v=4"
        alt=""
        width="384"
        height="512"
      />
      <div className="pt-6 text-center space-y-4">
          <div className="font-bold w-40 max-w-40 truncate overflow-hidden text-ellipsis whitespace-nowrap">Carlos alexandre</div>
      </div>
    </figure>
  );
}
