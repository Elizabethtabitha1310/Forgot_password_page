package com.example.forgot_password_page.models



    interface AppScreen {
        val route: String
        val title: String
    }
    object ForgotPassword :AppScreen {
        override val route: String = "forgot password"
        override val title: String = "forgot password"

    }

    object Login:AppScreen{
        override val route: String="login"
        override val title: String="login"
    }

    object CreatePassword :AppScreen{
        override val route: String="create-password"
        override val title: String="create-password"
    }

    object Dashboard :AppScreen{
        override val route: String="Dashboard"
        override val title: String="Dashboard"
    }
object FarmTech :AppScreen{
    override val route: String="farm_tech"
    override val title: String="farm_tech"
}
object Cart :AppScreen{
    override val route: String="cart"
    override val title: String="cart"
}
object Favourite :AppScreen{
    override val route: String="favourite"
    override val title: String="favourite"
}

