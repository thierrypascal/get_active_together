

// Added by the Spring Security Core plugin:
grails.plugin.springsecurity.userLookup.userDomainClassName    = 'webec.SecUser'
grails.plugin.springsecurity.userLookup.authorityJoinClassName = 'webec.SecUserSecRole'
grails.plugin.springsecurity.authority.className               = 'webec.SecRole'

grails.plugin.springsecurity.logout.postOnly = false // allow logout via get url /logout

grails.plugin.springsecurity.controllerAnnotations.staticRules = [
		[pattern: '/static/**',      access: ['permitAll']],
		[pattern: '/',               access: ['permitAll']],
		[pattern: '/error',          access: ['permitAll']],
		[pattern: '/shutdown',       access: ['permitAll']],
		[pattern: '/assets/**',      access: ['permitAll']],
		[pattern: '/**/js/**',       access: ['permitAll']],
		[pattern: '/**/css/**',      access: ['permitAll']],
		[pattern: '/**/images/**',   access: ['permitAll']],
		[pattern: '/**/favicon.ico', access: ['permitAll']],
]

grails.plugin.springsecurity.filterChain.chainMap = [
		[pattern: '/assets/**',      filters: 'none'],
		[pattern: '/**/js/**',       filters: 'none'],
		[pattern: '/**/css/**',      filters: 'none'],
		[pattern: '/**/images/**',   filters: 'none'],
		[pattern: '/**/favicon.ico', filters: 'none'],
		[pattern: '/**',             filters: 'JOINED_FILTERS']
]

// config types are 'Annotation', 'Requestmap', or 'InterceptUrlMap'
grails.plugin.springsecurity.securityConfigType = 'InterceptUrlMap'
grails.plugin.springsecurity.interceptUrlMap =  [
		[pattern: "/meetup/admin",   access: ['ROLE_ADMIN']],
		[pattern: "/meetup",   		 access: ['ROLE_ADMIN']],
		[pattern: "/meetup/index",   access: ['ROLE_ADMIN']],

		[pattern: '/',               access: ['permitAll']],
		[pattern: '/error',          access: ['permitAll']],
		[pattern: '/shutdown',       access: ['permitAll']],
		[pattern: '/assets/**',      access: ['permitAll']],
		[pattern: '/**/js/**',       access: ['permitAll']],
		[pattern: '/**/css/**',      access: ['permitAll']],
		[pattern: '/**/images/**',   access: ['permitAll']],
		[pattern: '/**/favicon.ico', access: ['permitAll']],
		[pattern: "/login/auth",     access: ["permitAll"]],
		[pattern: "/location/**",    access: ["permitAll"]],
		[pattern: "/person/**",      access: ["permitAll"]],
		[pattern: "/timeslot/**",    access: ["permitAll"]],
		[pattern: "/meetup/**",   	 access: ["permitAll"]],

		[pattern: "/**"        ,     access: ['ROLE_ADMIN']],
]
