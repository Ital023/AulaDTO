import CardMinDTO from "../../../components/CardMinDTO";

export default function MinDTO() {
  return (
    <main className="max-w-[1240px] container mx-auto py-10">
      <div className="grid grid-cols-4 justify-items-center gap-y-10">
        <CardMinDTO />
        <CardMinDTO />
        <CardMinDTO />
        <CardMinDTO />
        <CardMinDTO />


      </div>
    </main>
  );
}
