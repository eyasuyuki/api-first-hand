

    import de.zalando.play.controllers.ArrayWrapper

    import de.zalando.play.controllers.PlayPathBindables


//noinspection ScalaStyle
package object expanded {

    type PetsIdDeleteResponses204 = Null
    type PetsIdDeleteId = Long
    type PetsGetLimit = Option[Int]
    type PetsGetTagsOpt = ArrayWrapper[String]
    type NewPetTag = Option[String]
    type PetsGetResponses200 = Seq[Pet]
    type PetsGetTags = Option[PetsGetTagsOpt]


import play.api.mvc.{QueryStringBindable, PathBindable}

    implicit val bindable_OptionIntQuery: QueryStringBindable[Option[Int]] = PlayPathBindables.createOptionQueryBindable[Int]
    implicit val bindable_ArrayWrapperStringQuery: QueryStringBindable[ArrayWrapper[String]] = PlayPathBindables.createArrayWrapperQueryBindable[String]("csv")
    implicit val bindable_OptionPetsGetTagsOptQuery: QueryStringBindable[Option[PetsGetTagsOpt]] = PlayPathBindables.createOptionQueryBindable[PetsGetTagsOpt]

}
//noinspection ScalaStyle
package expanded {


    case class NewPet(name: String, tag: NewPetTag) 
    case class Pet(name: String, tag: NewPetTag, id: Long) 
    case class Error(code: Int, message: String) 


}
